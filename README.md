# 📱 Image Compressor App

A lightweight Android application for compressing images with adjustable quality settings.  Built with Java and native Android APIs.

## ✨ Features

- 📸 **Easy Image Selection** - Pick images from your device gallery
- 🎚️ **Adjustable Quality** - Control compression quality from 0-100%
- 💾 **Auto Save** - Compressed images automatically saved to Pictures/CompressedImages
- 🖼️ **Format Support** - Supports both JPEG and PNG formats
- ⚡ **Fast & Efficient** - Uses native Android Bitmap compression
- 🎯 **Simple UI** - Clean and intuitive user interface

## 📸 Screenshots

<!-- Add screenshots here when available -->
_Screenshots coming soon! _

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest version recommended)
- Android SDK 36
- Minimum Android version: 6.0 (API level 23) but need to to updated to API 30 for the Older version : visit this <a href="https://github.com/shaiksahilrizwan/ImageCompressor">Repo</a>
- Java 11

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/shaiksahilrizwan/ImageCompressorApp.git
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository folder

3. **Build the project**
   - Wait for Gradle sync to complete
   - Click "Build" → "Make Project"

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press Shift + F10

## 📖 How to Use

1. **Select an Image**
   - Tap on the image placeholder
   - Choose an image from your device gallery

2. **Set Quality**
   - Use the SeekBar to adjust compression quality (1-100)
   - Lower values = smaller file size, lower quality
   - Higher values = larger file size, better quality

3. **Compress**
   - Tap the "Convert" button
   - The compressed image will be saved to Pictures/CompressedImages folder

## 🏗️ Project Structure

```
ImageCompressorApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/imgcomp/imagecompressor/
│   │   │   │   ├── MainActivity.java           # Main UI and logic
│   │   │   │   └── compression_saving/
│   │   │   │       └── ImageCompression.java   # Core compression logic
│   │   │   ├── res/                            # Resources (layouts, drawables)
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/                        # Instrumented tests
│   │   └── test/                               # Unit tests
│   └── build.gradle.kts                        # App-level build config
├── gradle/                                     # Gradle wrapper
├── build.gradle.kts                            # Project-level build config
├── settings.gradle.kts
├── LICENSE
└── README.md
```

## 🛠️ Technical Details

### Built With

- **Language:** Java
- **Min SDK:** 30 (Android 6.0 Marshmallow)
- **Target SDK:** 36
- **Build System:** Gradle with Kotlin DSL

### Key Dependencies

- AndroidX AppCompat
- Material Design Components
- AndroidX Activity
- ConstraintLayout

### Compression Algorithm

The app uses Android's native `Bitmap. compress()` method which provides:
- Efficient compression for both JPEG and PNG formats
- Quality control for JPEG images
- Low memory footprint

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## 🐛 Known Issues & Limitations

- Quality setting above 90% shows a warning (by design)
- Only supports single image compression (batch processing coming soon)
- No preview of compressed image before saving
- No option to choose save location

## 🎯 Future Enhancements

- [ ] Batch image compression
- [ ] Before/After comparison view
- [ ] Custom save location
- [ ] Image format conversion
- [ ] File size reduction percentage display
- [ ] Share compressed images directly
- [ ] Dark mode support
- [ ] More compression algorithms

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Shaik Sahil Rizwan**

- GitHub: [@shaiksahilrizwan](https://github.com/shaiksahilrizwan)

## 🙏 Acknowledgments

- Thanks to the Android open source community
- Inspired by the need for simple, offline image compression tools

## 📞 Support

If you have any questions or need help, please:
- Open an issue on GitHub
- Star ⭐ this repository if you find it helpful! 

---

**Made with ❤️ for the Android community**
