loaders: [
    {
        test: /\.js$/,
        loader: 'babel',
        exclude: /node_modules/,
        query: {
            cacheDirectory: true,
            presets: ['es2015', 'react']
        }
    },
    {
      test: /\.css$/,
      loader: 'style!css-loader?modules&importLoaders=1&localIdentName=[name]__[local]___[hash:base64:5]'
    }
]