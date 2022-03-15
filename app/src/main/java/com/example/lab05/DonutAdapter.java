package com.example.lab05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class DonutApdapter extends BaseAdapter {
        private Context context;
        private int idLayout;
        private List<Donut> listDonut;
        private int positionSelect = -1;

        public DonutApdapter(Context context, int idLayout, List<Donut> listDonut) {
            this.context = context;
            this.idLayout = idLayout;
            this.listDonut = listDonut;
        }



        @Override
        public int getCount() {
            if (listDonut.size() != 0 && !listDonut.isEmpty()) {
                return listDonut.size();
            }
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
            }
            TextView tvmoTa = convertView.findViewById(R.id.txtAbout);
            TextView tvDonutName = (TextView) convertView.findViewById(R.id.txtName);
            TextView tvDonutPrice = (TextView) convertView.findViewById(R.id.txtPrice);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            final Donut donut = listDonut.get(position);

            if (listDonut != null && !listDonut.isEmpty()) {
                tvmoTa.setText(donut.getAbout());
                tvDonutName.setText(donut.getName());
                imageView.setImageResource(donut.getImg());
                tvDonutPrice.setText(donut.getPrice());
            }
            return convertView;
    }
}
