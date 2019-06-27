package com.example.ethnicarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView paintings,sculptures,masks;
    private ImageView vase,lamps,handbags;
    private ImageView music,handicrafts,jewellery;
    private ImageView baskets,clothing,miscellaneous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        Toast.makeText(this, "Welcome Admin", Toast.LENGTH_SHORT).show();

        paintings = (ImageView) findViewById(R.id.paintings);
        sculptures = (ImageView) findViewById(R.id.sculptures);
        masks = (ImageView) findViewById(R.id.masks);

        vase = (ImageView) findViewById(R.id.vase);
        lamps = (ImageView) findViewById(R.id.lamps);
        handbags = (ImageView) findViewById(R.id.handbags);

        music = (ImageView) findViewById(R.id.music);
        handicrafts = (ImageView) findViewById(R.id.handicrafts);
        jewellery = (ImageView) findViewById(R.id.jewellery);

        baskets = (ImageView) findViewById(R.id.baskets);
        clothing = (ImageView) findViewById(R.id.clothing);
        miscellaneous = (ImageView) findViewById(R.id.miscellaneous);


      paintings.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
              intent.putExtra("category","Paintings");
              startActivity(intent);
          }
      });

        sculptures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Sculptures");
                startActivity(intent);
            }
        });

        masks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Masks");
                startActivity(intent);
            }
        });

        vase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Vases");
                startActivity(intent);
            }
        });

        lamps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Lamps");
                startActivity(intent);
            }
        });

        handbags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Handbags");
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Musical Instruments");
                startActivity(intent);
            }
        });

        handicrafts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Handicrafts");
                startActivity(intent);
            }
        });

        jewellery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Jewellery");
                startActivity(intent);
            }
        });

        baskets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Baskets");
                startActivity(intent);
            }
        });

        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Clothing");
                startActivity(intent);
            }
        });

        miscellaneous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Miscellaneous");
                startActivity(intent);
            }
        });
    }
}
