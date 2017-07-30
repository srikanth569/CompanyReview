package com.srikanth.companyreview.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.model.Company;
import com.srikanth.companyreview.model.Review;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {


    ArrayList<Review> reviews;

    public ReviewAdapter(Company company) {
        this.reviews = (ArrayList<Review>) company.getReviews();
    }

    @Override
    public ReviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_review, parent, false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewViewHolder holder, int position) {
        Review review = reviews.get(position);
        holder.header.setText(review.getHeadline());
        holder.jobTitle.setText(review.getJobTitle());
        holder.prosText.setText(review.getPros());
        holder.consText.setText(review.getCons());
    }

    @Override
    public int getItemCount() {
        return reviews == null ? 0 : reviews.size();
    }

    class ReviewViewHolder extends RecyclerView.ViewHolder {

        TextView header;
        TextView jobTitle;
        TextView prosText;
        TextView consText;

        public ReviewViewHolder(View itemView) {
            super(itemView);
            header = itemView.findViewById(R.id.headline);
            jobTitle = itemView.findViewById(R.id.jobTitle);
            prosText = itemView.findViewById(R.id.prosText);
            consText = itemView.findViewById(R.id.consText);
        }
    }
}
