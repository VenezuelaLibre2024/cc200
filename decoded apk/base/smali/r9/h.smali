.class public Lr9/h;
.super Lr9/f;
.source ""


# static fields
.field public static n:Z = false


# instance fields
.field public final m:Landroid/net/Uri;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lq9/h;Ln7/g;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr9/f;-><init>(Lq9/h;Ln7/g;)V

    const/4 p1, 0x1

    sput-boolean p1, Lr9/h;->n:Z

    iput-object p3, p0, Lr9/h;->m:Landroid/net/Uri;

    const-string p1, "X-Goog-Upload-Protocol"

    const-string p2, "resumable"

    invoke-super {p0, p1, p2}, Lr9/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "X-Goog-Upload-Command"

    const-string p2, "cancel"

    invoke-super {p0, p1, p2}, Lr9/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "POST"

    return-object v0
.end method

.method public u()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lr9/h;->m:Landroid/net/Uri;

    return-object v0
.end method
