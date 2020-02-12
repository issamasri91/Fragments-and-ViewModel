package bondarenko.samsungit.classwork.fragmentsandviewmodel.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

     private static NetworkService instatnce;
     private static final String BASE_URL = "http://www.recipepuppy.com/api";
     private Retrofit retrofit;

     private NetworkService(){
         retrofit = new Retrofit.Builder()
                 .baseUrl(BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();
     }

     public static NetworkService getInstatnce(){
          if(instatnce == null){
               instatnce = new NetworkService();
          }
          return instatnce;
     }
}
