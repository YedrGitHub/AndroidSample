package com.malinkang.viewpager.fragmentpageradapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.malinkang.fragmentpageradaptersample.R;

public class TestFragment extends Fragment {

	private static final String TAG = TestFragment.class.getSimpleName();

	private String letter;

	public static TestFragment newInstance(String letter) {
		TestFragment fragment = new TestFragment();
		Bundle bundle = new Bundle();
		bundle.putString("letter", letter);
		fragment.setArguments(bundle);
		return fragment;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d(TAG, "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		letter = getArguments().getString("letter");
		Log.d(TAG, "onCreate---" + letter);
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView---" + letter);
		View view = inflater.inflate(R.layout.fragment_test, container, false);
		TextView letterTextView = (TextView) view.findViewById(R.id.tv_letter);
		letterTextView.setText(letter);
		return view;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "onActivityCreated---" + letter);
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "onStart---" + letter);
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "onResume---" + letter);
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "onPause---" + letter);
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d(TAG, "onStop---" + letter);
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(TAG, "onDestroyView---" + letter);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy---" + letter);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(TAG, "onDetach---" + letter);
	}

}
