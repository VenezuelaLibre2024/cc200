.class public final Lc7/ta;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Landroid/content/ComponentName;

.field public final synthetic i:Lc7/ra;


# direct methods
.method public constructor <init>(Lc7/ra;Landroid/content/ComponentName;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ta;->h:Landroid/content/ComponentName;

    iput-object p1, p0, Lc7/ta;->i:Lc7/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/ta;->i:Lc7/ra;

    iget-object v0, v0, Lc7/ra;->j:Lc7/y9;

    iget-object v1, p0, Lc7/ta;->h:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lc7/y9;->D(Lc7/y9;Landroid/content/ComponentName;)V

    return-void
.end method
