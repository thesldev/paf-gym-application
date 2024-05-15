import firebase from "firebase/compat/app";
import "firebase/compat/auth";
import "firebase/compat/firestore";

const firebaseConfig = {
  apiKey: "AIzaSyBWdHYWNdeub0zRbCsF7juQqwI1TswgxzI",
  authDomain: "gym-application-17c01.firebaseapp.com",
  projectId: "gym-application-17c01",
  storageBucket: "gym-application-17c01.appspot.com",
  messagingSenderId: "633494716183",
  appId: "1:633494716183:web:1b938619b8b4cdfa340152",
  measurementId: "G-1E6R6PX00B",
};

// Initialize Firebases
firebase.initializeApp(firebaseConfig);

export default firebase;
