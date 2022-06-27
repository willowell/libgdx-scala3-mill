package core

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class MyGdxGame extends ApplicationAdapter:
  var batch: SpriteBatch = null
  var img: Texture       = null

  override def create(): Unit =
    batch = SpriteBatch()
    img = Texture("badlogic.jpg")

  override def render(): Unit =
    ScreenUtils.clear(1, 0, 0, 1)
    batch.begin()
    batch.draw(img, 0, 0)
    batch.end()

  override def dispose(): Unit =
    batch.dispose()
    img.dispose()
