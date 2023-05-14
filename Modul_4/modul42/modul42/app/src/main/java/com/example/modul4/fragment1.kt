package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment(){
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val login: Button = view.findViewById(R.id.btnjumlah)
        val fragmentManager = parentFragmentManager
        val fragmentsecond = fragment2()
        login.setOnClickListener{
            val bundle = Bundle()
            bundle.putString(fragment2.JUDUL, "Hasil Dari Penjumlahan")
            val input1 : EditText = view.findViewById(R.id.input_angka1)
            val input2 : EditText = view.findViewById(R.id.input_angka2)

            val angka1: Int = input1.text.toString().toInt()
            val angka2: Int = input2.text.toString().toInt()

            val hasilJumlah: Int = angka1 + angka2

            val hasilString: String = hasilJumlah.toString()
            fragmentsecond.arguments = bundle
            fragmentsecond.hasil = hasilString

            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragmentsecond, fragment2::class.java.simpleName)
                    .commit()
            }
        }
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}