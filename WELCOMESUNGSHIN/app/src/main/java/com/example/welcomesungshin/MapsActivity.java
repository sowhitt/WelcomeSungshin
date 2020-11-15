package com.example.welcomesungshin;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.nfc.NfcAdapter;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.support.v7.app.AlertDialog;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.gms.maps.MapFragment;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    List<Polyline> polylines = new ArrayList<Polyline>();

    MapFragment mapFragment;
    LocationManager locationManager;
    RelativeLayout boxMap;

    double mLatitude = 37.591254;
    double mLongitude = 127.021978;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        boxMap = (RelativeLayout)findViewById(R.id.boxMap);

        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);


        //GPS가 켜져있는지 체크
        if(!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            //GPS 설정화면으로 이동
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            startActivity(intent);
            finish();
        }

        //마시멜로 이상이면 권한 요청하기
        if(Build.VERSION.SDK_INT >= 23){
            //권한이 없는 경우
            if(ContextCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED ||
                    ContextCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MapsActivity.this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.ACCESS_FINE_LOCATION} , 1);
            }
            //권한이 있는 경우
            else{
                requestMyLocation();
            }
        }
    }

    //권한 요청후 응답
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //ACCESS_COARSE_LOCATION 권한
        if(requestCode==1){
            //권한받음
            if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                requestMyLocation();
            }
            //권한못받음
            else{
                Toast.makeText(this, "권한없음", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    //위치 요청
    public void requestMyLocation(){
        if(ContextCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            return;
        }
        //요청
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 100, 10, locationListener);
    }

    //위치정보 구하기
    LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            if(ContextCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED ||
                    ContextCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            //나의 위치를 한번만 가져오기 위해
            locationManager.removeUpdates(locationListener);

            mLatitude = location.getLatitude();
            mLongitude = location.getLongitude();

            SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(MapsActivity.this);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) { Log.d("gps", "onStatusChanged"); }

        @Override
        public void onProviderEnabled(String provider) { }

        @Override
        public void onProviderDisabled(String provider) { }
    };

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    public Bitmap resizeMapIcons(String iconName, int width, int height) {
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(), getResources().getIdentifier(iconName, "drawable", getPackageName()));
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(imageBitmap, width, height, false);
        return resizedBitmap;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        requestMyLocation();

        LatLng po = new LatLng(mLatitude , mLongitude);
        LatLng street = new LatLng(37.591437, 127.019302);
        LatLng store[] = new LatLng[20];
        store[0] = new LatLng(37.591545, 127.019656);
        store[1] = new LatLng(37.591527, 127.020057);
        store[2] = new LatLng(37.591004, 127.019198 );
        store[3] = new LatLng(37.591817, 127.020422 );
        store[4] = new LatLng(37.592131, 127.018164);
        store[5] = new LatLng(37.590759, 127.018564 );
        store[6] = new LatLng(37.5908703, 127.0189763);
        store[7] = new LatLng(37.5914104, 127.0205247);
        store[8] = new LatLng(37.5916668, 127.0181962);
        store[9] = new LatLng(37.5912000, 127.0205150);
        store[10] = new LatLng(37.5907506, 127.0200751);
        store[11] = new LatLng(37.592640, 127.017313);
        store[12] = new LatLng(37.5921184, 127.0172287);
        store[13] = new LatLng(37.5901563, 127.0181659);
        store[14] = new LatLng(37.5905499, 127.0199578);
        store[15] = new LatLng(37.5906743, 127.0203041);
        store[16] = new LatLng(37.5908601, 127.0192629);

        Marker My = mMap.addMarker(new MarkerOptions().position(po));

        Marker Miozio = mMap.addMarker(new MarkerOptions().position(store[0])
                .title("미오지오")
                .snippet("\"새우 5개 들어있는데 파스타랑 먹기에 딱 적당하고 소스도 크림 덕후들은 환장할 맛임.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("miozio", 130, 130))));
        Marker India = mMap.addMarker(new MarkerOptions().position(store[1])
                .title("인도이웃")
                .snippet("\"튀김은 진짜 바삭바삭해서 잊을 수 없는 맛이고 카레는 건강한 느낌.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("india", 130, 130))));

        Marker Yoonhui = mMap.addMarker(new MarkerOptions().position(store[2])
                .title("윤휘식당")
                .snippet("\"일본 가정식 중에서도 특색있고 맛있어서 왜 유명한지 알것같음. 양도 든든함.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("yoons", 130, 130))));
        Marker Togo = mMap.addMarker(new MarkerOptions().position(store[3])
                .title("투고 샐러드")
                .snippet("\"단백질이랑 채소 보충하기에 짱. 가격은 저렴한 편 아님.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("salad", 130, 130))));
        Marker Three = mMap.addMarker(new MarkerOptions().position(store[4])
                .title("쓰리 로보스")
                .snippet("\"닭다리가 예술. 치킨 먹다가 퍽퍽할 때쯤 샐러드 먹으면 치킨 무 필요없음.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("threelobos", 130, 130))));
        Marker Hiviet = mMap.addMarker(new MarkerOptions().position(store[5])
                .title("안녕 베트남")
                .snippet("\"분짜의 쌀국수가 보들보들. 고기양념은 달달하고 촉촉하고 최고다.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("seoseo", 130, 130))));
        Marker Greek = mMap.addMarker(new MarkerOptions().position(store[6])
                .title("그릭데이")
                .snippet("\"기분 좋게 든든하다. 꾸덕하고 맛있다.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("greekday", 130, 130))));
        Marker Arirang = mMap.addMarker(new MarkerOptions().position(store[7])
                .title("아리랑")
                .snippet("\"저렴하고 맛있는건 아리랑이 최고.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("alilang", 130, 130))));
        Marker Crape = mMap.addMarker(new MarkerOptions().position(store[8])
                .title("본크레페")
                .snippet("\" 성신여대 최고의 크레페 맛집. 본크레페를 맛보지 않은 자 크레페는 논하지 말라.\"")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("crepe", 110, 110))));
        Marker Mencave = mMap.addMarker(new MarkerOptions().position(store[9])
                .title("맨케이브")
                .snippet("얼음이 녹아서 밍밍해진 음료는 이제 그만. 음료 자체를 얼린 수제얼음이 트레이드마크.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("mancave", 110, 110))));
        Marker Regiano = mMap.addMarker(new MarkerOptions().position(store[10])
                .title("레지아노")
                .snippet("빠네 크림파스타를 추천합니다. 맛, 양, 분위기 3박자 완벽한 곳.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("resiano", 110, 110))));
        Marker Jobujang = mMap.addMarker(new MarkerOptions().position(store[11])
                .title("조부장 성신김밥")
                .snippet("지하철역 앞에서 픽업 3초컷. 아침수업이 있는 날에는 든든하고 간편한 성신김밥이 필수")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("kimbab", 110, 110))));
        Marker Ehjung = mMap.addMarker(new MarkerOptions().position(store[12])
                .title("애정 마라샹궈")
                .snippet("애정은 사랑입니다. 마라를 사랑하는 자, 애정을 경험해보지 않고 마라를 좋아한다 말하지 마라.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("mara", 110, 110))));
        Marker Bugerbible = mMap.addMarker(new MarkerOptions().position(store[13])
                .title("버거 바이블")
                .snippet("수제버거지만 자극적이지 않은 맛. 성신에서 느끼는 이태원.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("burger", 110, 110))));
        Marker Modern = mMap.addMarker(new MarkerOptions().position(store[14])
                .title("모던 바이츠")
                .snippet("촉촉한 쿠키와 꾸덕한 스콘이 맛있는 집. 앙버터도 대표적인 메뉴.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("modernbites", 110, 110))));
        Marker Slow = mMap.addMarker(new MarkerOptions().position(store[15])
                .title("슬로우 브레드 파파")
                .snippet("당이 떨어지는 날 효과만점인 초코타르트. 슬브파의 겉바속촉 앙버터도 추천.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("papa", 110, 110))));
        Marker Mejong = mMap.addMarker(new MarkerOptions().position(store[16])
                .title("메종 드루즈")
                .snippet("줄 서서 사먹는 마카롱집. 오후에 가면 마카롱이 없을수도? 일찍 메종에 가는 자, 최고의 마카롱을 얻는다.")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeMapIcons("mejong", 110, 110))));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(street, 18));

        mMap.setOnMarkerClickListener(this);

        boxMap.setVisibility(View.VISIBLE);
    }

    public boolean onMarkerClick(Marker marker) {

        LatLng uni = new LatLng(37.591254, 127.021978);

        polylines.add(this.mMap.addPolyline(new PolylineOptions().add(marker.getPosition(), uni).width(5).color(Color.RED)));

        return false;
    }



    public int i;
    public final CharSequence[] items = { "미오지오", "인도이웃", "윤휘식당", "투고샐러드", "쓰리로보스", "안녕베트남", "그릭데이", "아리랑", "본크레페",
            "멘케이브", "레지아노", "조부장성신김밥",  "애정마라샹궈", "버거바이블", "모던바이츠", "슬로우브레드파파", "메종드루즈"};
    public void Dijkstra(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("어디로 가고싶나요?");
        alertDialogBuilder.setItems(items,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int id) {
                        i = id;
                        // 프로그램을 종료한다
                        dialog.dismiss();
                        draw();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    //최단경로 그리기
    public void draw(){
        double distance, dis, dis1, dis2, dis3, dis4;
        String meter;

        double latA[] = new double[]{37.591545, 37.591527, 37.591004, 37.591817, 37.592131,
                37.590759, 37.5908703, 37.5914104, 37.5916668, 37.5912000, 37.5907506, 37.592640,37.5921184, 37.5901563, 37.5905499, 37.5906743, 37.5908601};
        double lngA[] = new double[]{127.019656 , 127.020057 , 127.019198, 127.020422 , 127.018164, 127.018564,
                127.0189763, 127.0205247, 127.0181962, 127.0205150, 127.0200751, 127.017313, 127.0172287, 127.0181659, 127.0199578 , 127.0203041,127.0192629};

        double latB[] = new double[]{37.591345, 37.591345, 37.591345, 37.591315 , 37.591345, 37.591345,
                37.591320 , 37.591315, 37.591320, 37.591315, 37.591345, 37.591320, 37.591320, 37.591320, 37.591345, 37.591315, 37.591320 };
        double lngB[] = new double[]{127.019913 , 127.019913 , 127.019913, 127.020418  , 127.019913, 127.019913,
                127.019888 , 127.020418, 127.019888, 127.020418, 127.019913 , 127.019888 , 127.019888 , 127.019888 , 127.019913 , 127.020418 , 127.019888};

        double latC[] = new double[]{37.591427 , 37.591345 , 37.591072 , 37.591315  , 37.590861 , 37.590861 ,
                37.591017  , 37.591315 , 37.590861 , 37.591315 , 37.590784 , 37.590861 , 37.590861 , 37.590861 , 37.590574 , 37.591315 , 37.591082 };
        double lngC[] = new double[]{127.019870  , 127.019913 , 127.019138, 127.020418   , 127.018398 , 127.018398 ,
                127.018905 , 127.020418 , 127.018398 , 127.020418 , 127.019841, 127.018398 , 127.018398 , 127.018398 , 127.019809, 127.020418 , 127.019102 };

        double latD[] = new double[]{37.591501 , 37.591345 , 37.591072  , 37.591315  , 37.591939 , 37.590861 ,
                37.591017  , 37.591315 , 37.591635 , 37.591315 , 37.590784 , 37.592714 , 37.592209 , 37.590184 , 37.590574 , 37.591315 ,37.590833};
        double lngD[] = new double[]{127.019572  , 127.019913 , 127.019138 , 127.020418   , 127.017862 , 127.018398 ,
                127.018905 , 127.020418 , 127.018001, 127.020418 , 127.019841, 127.017471, 127.017724, 127.018731 , 127.019809 , 127.020418 , 127.019229};

        double latE[] = new double[]{37.591501 , 37.591345 , 37.591072  , 37.591315 , 37.592034 , 37.590861,
                37.591017  , 37.591315 , 37.591635 , 37.591315 , 37.590784 , 37.592714 , 37.592209 , 37.590014 , 37.590574 , 37.591315 ,37.590833 };
        double lngE[] = new double[]{127.019572 , 127.019913 , 127.019138 , 127.020418  , 127.018208, 127.018398,
                127.018905 , 127.020418 , 127.018001, 127.020418 , 127.019841, 127.017471, 127.017724, 127.018226, 127.019809 , 127.020418 , 127.019229};

        Location locationA = new Location("pointA");
        locationA.setLatitude(latA[i]);
        locationA.setLongitude(lngA[i]);

        Location locationB = new Location("pointB");
        locationB.setLatitude(latB[i]);
        locationB.setLongitude(lngB[i]);

        Location locationC = new Location("pointC");
        locationC.setLatitude(latC[i]);
        locationC.setLongitude(lngC[i]);

        Location locationD = new Location("pointD");
        locationD.setLatitude(latD[i]);
        locationD.setLongitude(lngD[i]);

        Location locationE = new Location("pointE");
        locationE.setLatitude(latE[i]);
        locationE.setLongitude(lngE[i]);

        Location locationF = new Location("pointF");
        locationF.setLatitude(37.591254);
        locationF.setLongitude(127.021978);


        dis = locationA.distanceTo(locationE);
        dis1 = locationE.distanceTo(locationD);
        dis2 = locationD.distanceTo(locationC);
        dis3 = locationC.distanceTo(locationB);
        dis4 = locationB.distanceTo(locationF);
        distance = dis+dis1+dis2+dis3 + dis4;

        meter = Integer.toString((int)distance);

        Toast.makeText(getApplicationContext(), items[i] + "까지의 최단거리는 " + meter + "m", Toast.LENGTH_SHORT).show();

        Erase(boxMap);

        LatLng positionA = new LatLng(latA[i], lngA[i]);
        LatLng positionB = new LatLng(latB[i], lngB[i]);
        LatLng positionC = new LatLng(latC[i], lngC[i]);
        LatLng positionD = new LatLng(latD[i], lngD[i]);
        LatLng positionE = new LatLng(latE[i], lngE[i]);
        LatLng positionF = new LatLng(mLatitude, mLongitude);

        polylines.add(this.mMap.addPolyline(new PolylineOptions().add(positionA,positionE).add(positionE,positionD).add(positionD,positionC).add(positionC,positionB).add(positionB,positionF).width(5).color(Color.BLUE)));
    }

    public void Erase(View v) {
        for(Polyline line : polylines)
        {
            line.remove();
        }
        polylines.clear();
    }

}