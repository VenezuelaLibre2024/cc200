.class public final synthetic Lio/flutter/embedding/android/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/embedding/android/KeyEmbedderResponder;

.field public final synthetic i:Lio/flutter/embedding/android/KeyboardMap$KeyPair;

.field public final synthetic j:J

.field public final synthetic k:Landroid/view/KeyEvent;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/embedding/android/KeyEmbedderResponder;Lio/flutter/embedding/android/KeyboardMap$KeyPair;JLandroid/view/KeyEvent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/d;->h:Lio/flutter/embedding/android/KeyEmbedderResponder;

    iput-object p2, p0, Lio/flutter/embedding/android/d;->i:Lio/flutter/embedding/android/KeyboardMap$KeyPair;

    iput-wide p3, p0, Lio/flutter/embedding/android/d;->j:J

    iput-object p5, p0, Lio/flutter/embedding/android/d;->k:Landroid/view/KeyEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lio/flutter/embedding/android/d;->h:Lio/flutter/embedding/android/KeyEmbedderResponder;

    iget-object v1, p0, Lio/flutter/embedding/android/d;->i:Lio/flutter/embedding/android/KeyboardMap$KeyPair;

    iget-wide v2, p0, Lio/flutter/embedding/android/d;->j:J

    iget-object v4, p0, Lio/flutter/embedding/android/d;->k:Landroid/view/KeyEvent;

    invoke-static {v0, v1, v2, v3, v4}, Lio/flutter/embedding/android/KeyEmbedderResponder;->c(Lio/flutter/embedding/android/KeyEmbedderResponder;Lio/flutter/embedding/android/KeyboardMap$KeyPair;JLandroid/view/KeyEvent;)V

    return-void
.end method
