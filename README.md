# CustomToast
<h1>Android Library to show Custom Toast message</h1>

[![](https://jitpack.io/v/sad-adnan/customToast.svg)](https://jitpack.io/#sad-adnan/customToast)

 [Please don't use v1.2 or 1.2 they are deleted and not meant for production , they are actually not usable]

<h3><b>To get a Git project into your build:</b></h3>

Step 1. Add the JitPack repository to your build file

<b>gradle</b>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sad-adnan:customToast:v1.3'
	}
  
  <h3><b> Use Case</b></h3>
  
  <b>From version 1.1 you have default value of toast as Toast>LENGTH_SHORT so you can just give one parameter (2nd one) less, if you need short length.</b>
  
  	CustomToast.ShowSuccessToast(MainActivity.this,"Congratulations"); // 2nd parameter DEFAULT value false --> Toast.LENGTH_SHORT
  
  <h4>you can show a success message by using below code :</h4>
        
        CustomToast.ShowSuccessToast(MainActivity.this,false,"Congratulations"); // 2nd parameter true --> Toast.LENGTH_LONG  , false --> Toast.LENGTH_SHORT
                 
  <h4>you can show a Error message by using below code :</h4>
        
        CustomToast.ShowErrorToast(MainActivity.this,false,"We are extremely sorry."); // 2nd parameter true --> Toast.LENGTH_LONG  , false --> Toast.LENGTH_SHORT
        
  <h4>you can show a Info message by using below code :</h4>
 
        CustomToast.ShowInfoToast(MainActivity.this,false,"We have updated your status."); // 2nd parameter true --> Toast.LENGTH_LONG  , false --> Toast.LENGTH_SHORT
       
       
       

   
   <h4>you can show a custom Toast message with icon and message by using below code :
   <h5>you have to pass drawable resource id (R.drawable.yourdrawable) and color id (R.color.yourcolor) in 4th and 5th Parameter respectively</h5></h4>
       
        CustomToast.showToastWithCustomDrawableAndBG(MainActivity.this,false,"Custom Icon",R.drawable.ic_baseline_auto_delete_24,R.color.toastColor); // 2nd parameter true --> Toast.LENGTH_LONG  , false --> Toast.LENGTH_SHORT
        CustomToast.showToastWithoutIcon(MainActivity.this,false,"Without icon",R.color.toastColor2); // this method will only show text, without any drawable , 2nd parameter true --> Toast.LENGTH_LONG  , false --> Toast.LENGTH_SHORT
            

           
   


<img src="https://raw.githubusercontent.com/sad-adnan/customToast/master/demo.gif"/>
