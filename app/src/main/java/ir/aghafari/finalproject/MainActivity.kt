package ir.aghafari.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "صفحه ثبت نام"

        val framesingin = findViewById<FrameLayout>(R.id.ac_frame_singin)
        val frameinfo = findViewById<FrameLayout>(R.id.ac_frame_info)
        val edtfname = findViewById<EditText>(R.id.edtext_name)
        val edtlname = findViewById<EditText>(R.id.edtext_lname)
        val edtfather = findViewById<EditText>(R.id.edtext_father)
        val edtphone = findViewById<EditText>(R.id.edtext_phone)
        val radiog = findViewById<RadioGroup>(R.id.ac_start_rg)
        val chb1 = findViewById<CheckBox>(R.id.chb1)
        val chb2 = findViewById<CheckBox>(R.id.chb2)
        val chb3 = findViewById<CheckBox>(R.id.chb3)
        val chb4 = findViewById<CheckBox>(R.id.chb4)
        val btnsub = findViewById<Button>(R.id.ac_start_btn_submit)
        val  edtsp = findViewById<TextView>(R.id.txtsp)
        val txvshowfname = findViewById<TextView>(R.id.ac_showfname)
        val txvshowlname = findViewById<TextView>(R.id.ac_showlname)
        val txvshowfather = findViewById<TextView>(R.id.ac_showfather)
        val txvshowphone = findViewById<TextView>(R.id.ac_showphone)
        val txvshowwm = findViewById<TextView>(R.id.ac_showwm)
        val txvshowac = findViewById<TextView>(R.id.ac_showac)
        val txvshowchb1 = findViewById<TextView>(R.id.ac_showchb1)
        val txvshowchb2 = findViewById<TextView>(R.id.ac_showchb2)
        val txvshowchb3 = findViewById<TextView>(R.id.ac_showchb3)
        val txvshowchb4 = findViewById<TextView>(R.id.ac_showchb4)

        radiog.setOnCheckedChangeListener { group, checkedId ->
            val rgbcom = findViewById<RadioButton>(checkedId)
            txvshowwm.text = rgbcom.text
        }

        //-----------------------------------//

        val ac = arrayOf("نوع حساب را انتخاب کنید", "حساب کاربری عادی", "حساب کاربری برنزی", "حساب کاربری طلایی")
        val sp_ac = findViewById<Spinner>(R.id.sp_list)
        val sp_ad = ArrayAdapter(this, android.R.layout.simple_spinner_item, ac)
        sp_ac.adapter = sp_ad


        sp_ac.onItemSelectedListener = object :
            AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                edtsp.setText(ac.get(position))

            }

            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

        }

        //-----------------------------------//


        btnsub.setOnClickListener {

            var chbdata1 : String=""
            var chbdata2 : String=""
            var chbdata3 : String=""
            var chbdata4 : String=""
            var chbdata : String=""
//
//            if (chb1.isChecked) {
//                chbdata1 = 1
//            }else if (chb2.isChecked) {
//                chbdata2 = 2
//            }else if (chb3.isChecked) {
//                chbdata3 = 3
//            }else if (chb3.isChecked) {
//                chbdata4 = 4
//            }


            if (edtfname.text.toString().equals("") || edtlname.text.toString().equals("") || edtfather.text.toString().equals("") || edtphone.text.toString().equals("")) {

                Toast.makeText(getApplicationContext(), "تمام فیلد ها را پر کنید", Toast.LENGTH_LONG).show();

                    }else if ( edtphone.text.length != 11 || !edtphone.text.startsWith("09")){

                      Toast.makeText(getApplicationContext(), "شماره تلفن صحیح نیست!" , Toast.LENGTH_LONG).show();

                        }else if(radiog.checkedRadioButtonId==-1){

                            Toast.makeText(getApplicationContext(), "جنسیت خود را مشخص کنید" , Toast.LENGTH_LONG).show();

                            }else if(edtsp.text == "نوع حساب را انتخاب کنید"){

                                 Toast.makeText(getApplicationContext(), "نوع حساب کاربری خود را مشخص کنید" , Toast.LENGTH_LONG).show();

                                }else if (!chb1.isChecked && !chb2.isChecked && !chb3.isChecked && !chb4.isChecked) {

                                     Toast.makeText(getApplicationContext(), "علاقه مندی خود را مشخص کنید" , Toast.LENGTH_LONG).show();

                                             }else if (chb1.isChecked && !chb2.isChecked && !chb3.isChecked && !chb4.isChecked){

                                                 Toast.makeText(getApplicationContext(), "حداقل دو علاقه مندی انتخاب کنید" , Toast.LENGTH_LONG).show();

                                                }else if (!chb1.isChecked && chb2.isChecked && !chb3.isChecked && !chb4.isChecked){

                                                     Toast.makeText(getApplicationContext(), "حداقل دو علاقه مندی انتخاب کنید" , Toast.LENGTH_LONG).show();

                                                    }else if (!chb1.isChecked && !chb2.isChecked && chb3.isChecked && !chb4.isChecked){

                                                         Toast.makeText(getApplicationContext(), "حداقل دو علاقه مندی انتخاب کنید" , Toast.LENGTH_LONG).show();

                                                        }else if (!chb1.isChecked && !chb2.isChecked && !chb3.isChecked && chb4.isChecked){

                                                             Toast.makeText(getApplicationContext(), "حداقل دو علاقه مندی انتخاب کنید" , Toast.LENGTH_LONG).show();


                }else{

                if (chb1.isChecked) {
                    chbdata1+=chb1.text
                }
                if (chb2.isChecked){
                    chbdata2+=chb2.text
                }
                if (chb3.isChecked) {
                    chbdata3+=chb3.text
                }
                if (chb4.isChecked) {
                    chbdata4+=chb4.text
                }
                txvshowchb1.text = chbdata1
                txvshowchb2.text = chbdata2
                txvshowchb3.text = chbdata3
                txvshowchb4.text = chbdata4

                framesingin.visibility = View.GONE
                frameinfo.visibility = View.VISIBLE

                txvshowac.text = edtsp.text

                txvshowfname.text = edtfname.text
                txvshowlname.text = edtlname.text
                txvshowfather.text = edtfather.text
                txvshowphone.text = edtphone.text






            }
        }
    }
}
