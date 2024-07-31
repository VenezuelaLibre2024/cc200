.class public Lb2/b$a;
.super Landroid/webkit/WebMessagePort$WebMessageCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/b;->l(Landroid/webkit/WebMessagePort;La2/g$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La2/g$a;


# direct methods
.method public constructor <init>(La2/g$a;)V
    .locals 0

    iput-object p1, p0, Lb2/b$a;->a:La2/g$a;

    invoke-direct {p0}, Landroid/webkit/WebMessagePort$WebMessageCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V
    .locals 2

    iget-object v0, p0, Lb2/b$a;->a:La2/g$a;

    new-instance v1, Lb2/r;

    invoke-direct {v1, p1}, Lb2/r;-><init>(Landroid/webkit/WebMessagePort;)V

    invoke-static {p2}, Lb2/r;->h(Landroid/webkit/WebMessage;)La2/f;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, La2/g$a;->onMessage(La2/g;La2/f;)V

    return-void
.end method
