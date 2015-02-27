package com.example.canongameapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CannonGameFragment extends Fragment {
	private CanonView cannonView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savrdInstanceState)
	{
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_game,container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);
	}
	
	@Override
	public void onPause()
	{
		super.onPause();
		cannonView.stopGame();
	}
	
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		cannonView.releaseResources();
	}
}
