.class public Lb2/b$c;
.super Landroid/webkit/WebView$VisualStateCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/b;->i(Landroid/webkit/WebView;JLa2/h$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La2/h$a;


# direct methods
.method public constructor <init>(La2/h$a;)V
    .locals 0

    iput-object p1, p0, Lb2/b$c;->a:La2/h$a;

    invoke-direct {p0}, Landroid/webkit/WebView$VisualStateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(J)V
    .locals 1

    iget-object v0, p0, Lb2/b$c;->a:La2/h$a;

    invoke-interface {v0, p1, p2}, La2/h$a;->onComplete(J)V

    return-void
.end method
