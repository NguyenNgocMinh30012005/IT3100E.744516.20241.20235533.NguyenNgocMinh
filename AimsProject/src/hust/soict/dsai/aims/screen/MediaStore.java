package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Title label
        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        // Cost label
        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        // Button container
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Add to cart button
        JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.addActionListener(e -> addToCart());
        container.add(addToCartButton);

        // Play button (only if media is playable)
        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> playMedia());
            container.add(playButton);
        }

        // Add components to the MediaStore panel
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        // Add border to the panel
        Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
        this.setBorder(blackBorder);
    }

    // Action for the "Add to cart" button
    private void addToCart() {
        System.out.println("Added to cart: " + media.getTitle());
        // Add the media to the cart (you can implement this with a global or passed-in cart list)
        StoreScreen.cart.add(media);
    }

    // Action for the "Play" button
    private void playMedia() {
        JDialog playDialog = new JDialog();
        playDialog.setTitle("Playing Media");
        playDialog.setSize(300, 100);
        playDialog.setLayout(new FlowLayout());
        playDialog.add(new JLabel("Playing: " + media.getTitle()));
        playDialog.setVisible(true);
    }
}
