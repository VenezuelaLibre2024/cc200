.class public final synthetic Lio/flutter/embedding/android/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/embedding/android/KeyEmbedderResponder;

.field public final synthetic i:Lio/flutter/embedding/android/KeyboardMap$KeyPair;

.field public final synthetic j:Landroid/view/KeyEvent;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/embedding/android/KeyEmbedderResponder;Lio/flutter/embedding/android/KeyboardMap$KeyPair;Landroid/view/KeyEvent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/e;->h:Lio/flutter/embedding/android/KeyEmbedderResponder;

    iput-object p2, p0, Lio/flutter/embedding/android/e;->i:Lio/flutter/embedding/android/KeyboardMap$KeyPair;

    iput-object p3, p0, Lio/flutter/embedding/android/e;->j:Landroid/view/KeyEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/embedding/android/e;->h:Lio/flutter/embedding/android/KeyEmbedderResponder;

    iget-object v1, p0, Lio/flutter/embedding/android/e;->i:Lio/flutter/embedding/android/KeyboardMap$KeyPair;

    iget-object v2, p0, Lio/flutter/embedding/android/e;->j:Landroid/view/KeyEvent;

    invoke-static {v0, v1, v2}, Lio/flutter/embedding/android/KeyEmbedderResponder;->a(Lio/flutter/embedding/android/KeyEmbedderResponder;Lio/flutter/embedding/android/KeyboardMap$KeyPair;Landroid/view/KeyEvent;)V

    return-void
.end method
