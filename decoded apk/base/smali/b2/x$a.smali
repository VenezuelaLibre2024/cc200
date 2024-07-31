.class public Lb2/x$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/x;->onRendererUnresponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:La2/k;

.field public final synthetic i:Landroid/webkit/WebView;

.field public final synthetic j:La2/j;

.field public final synthetic k:Lb2/x;


# direct methods
.method public constructor <init>(Lb2/x;La2/k;Landroid/webkit/WebView;La2/j;)V
    .locals 0

    iput-object p1, p0, Lb2/x$a;->k:Lb2/x;

    iput-object p2, p0, Lb2/x$a;->h:La2/k;

    iput-object p3, p0, Lb2/x$a;->i:Landroid/webkit/WebView;

    iput-object p4, p0, Lb2/x$a;->j:La2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lb2/x$a;->h:La2/k;

    iget-object v1, p0, Lb2/x$a;->i:Landroid/webkit/WebView;

    iget-object v2, p0, Lb2/x$a;->j:La2/j;

    invoke-virtual {v0, v1, v2}, La2/k;->onRenderProcessUnresponsive(Landroid/webkit/WebView;La2/j;)V

    return-void
.end method
