package com.example.firstmvvmcleanarc.adduser.view

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firstmvvmcleanarc.R
import com.example.firstmvvmcleanarc.adduser.module.UserModule
import com.example.firstmvvmcleanarc.adduser.viewmodel.UserViewModelFactory
import javax.inject.Inject

class AddFragment : Fragment() {


    //private lateinit var mUserViewModel: UserViewModel

    @Inject
    lateinit var factory: UserViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

       // factory= UserViewModelFactory(addUserUseCase,userModuleDataMapper)
      //  mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        val firstName = view.findViewById<EditText>(R.id.first_name)
        val lastName = view.findViewById<EditText>(R.id.last_name)
        val userName = view.findViewById<EditText>(R.id.username)
        val password = view.findViewById<EditText>(R.id.password)
        val email = view.findViewById<EditText>(R.id.email)
        val saveBtn = view.findViewById<Button>(R.id.button)

      //  UserModule_ProvidesUserViewModelFactoryFactory.create()


        saveBtn.setOnClickListener {
            if (!(TextUtils.isEmpty(firstName.text) &&
                        TextUtils.isEmpty(lastName.text) &&
                        TextUtils.isEmpty(userName.text) &&
                        TextUtils.isEmpty(password.text) &&
                        TextUtils.isEmpty(email.text))
            ) {

                val userModel = UserModule(
                    0,
                    firstName.text.toString(),
                    lastName.text.toString(),
                    userName.text.toString(),
                    password.text.toString(),
                    email.text.toString(),
                )
              //  mUserViewModel.addUser(userModel)
                Toast.makeText(requireContext(),"success", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_addFragment_to_listFragment)
            }else{
                Toast.makeText(requireContext(),"input not valid", Toast.LENGTH_SHORT).show()
            }
        }



        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        injectViewModels()

        super.onActivityCreated(savedInstanceState)

        setUpViewModel()
        subscribeToViewModels()
    }


    private fun injectViewModels() {
//        DaggerCustomerComponent.builder()
//            .appComponent(App().appComponent)
//            .roomDbModule(RoomDbModule(requireContext()))
//            .build()
//            .inject(this)
    }

    private fun setUpViewModel() {
//        customerViewModel =
//            ViewModelProvider(this, customerViewModelFactory).get(CustomerViewModel::class.java)
    }


    private fun subscribeToViewModels() {
    }
}