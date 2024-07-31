.class public final Lc7/i9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Landroid/net/Uri;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lc7/e9;


# direct methods
.method public constructor <init>(Lc7/e9;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-boolean p2, p0, Lc7/i9;->h:Z

    iput-object p3, p0, Lc7/i9;->i:Landroid/net/Uri;

    iput-object p4, p0, Lc7/i9;->j:Ljava/lang/String;

    iput-object p5, p0, Lc7/i9;->k:Ljava/lang/String;

    iput-object p1, p0, Lc7/i9;->l:Lc7/e9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/i9;->l:Lc7/e9;

    iget-boolean v1, p0, Lc7/i9;->h:Z

    iget-object v2, p0, Lc7/i9;->i:Landroid/net/Uri;

    iget-object v3, p0, Lc7/i9;->j:Ljava/lang/String;

    iget-object v4, p0, Lc7/i9;->k:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lc7/e9;->a(Lc7/e9;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
