.class public final La5/h$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ls3/m1;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/h$b;->a:Landroid/net/Uri;

    iput-object p2, p0, La5/h$b;->b:Ls3/m1;

    iput-object p3, p0, La5/h$b;->c:Ljava/lang/String;

    iput-object p4, p0, La5/h$b;->d:Ljava/lang/String;

    iput-object p5, p0, La5/h$b;->e:Ljava/lang/String;

    iput-object p6, p0, La5/h$b;->f:Ljava/lang/String;

    return-void
.end method

.method public static b(Landroid/net/Uri;)La5/h$b;
    .locals 8

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    const-string v1, "application/x-mpegURL"

    invoke-virtual {v0, v1}, Ls3/m1$b;->M(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v3

    new-instance v0, La5/h$b;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, La5/h$b;-><init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ls3/m1;)La5/h$b;
    .locals 8

    new-instance v7, La5/h$b;

    iget-object v1, p0, La5/h$b;->a:Landroid/net/Uri;

    iget-object v3, p0, La5/h$b;->c:Ljava/lang/String;

    iget-object v4, p0, La5/h$b;->d:Ljava/lang/String;

    iget-object v5, p0, La5/h$b;->e:Ljava/lang/String;

    iget-object v6, p0, La5/h$b;->f:Ljava/lang/String;

    move-object v0, v7

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, La5/h$b;-><init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method
