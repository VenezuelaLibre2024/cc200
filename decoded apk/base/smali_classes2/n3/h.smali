.class public final synthetic Ln3/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ln3/s;

.field public final synthetic i:Lg3/p;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ln3/s;Lg3/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/h;->h:Ln3/s;

    iput-object p2, p0, Ln3/h;->i:Lg3/p;

    iput p3, p0, Ln3/h;->j:I

    iput-object p4, p0, Ln3/h;->k:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ln3/h;->h:Ln3/s;

    iget-object v1, p0, Ln3/h;->i:Lg3/p;

    iget v2, p0, Ln3/h;->j:I

    iget-object v3, p0, Ln3/h;->k:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Ln3/s;->a(Ln3/s;Lg3/p;ILjava/lang/Runnable;)V

    return-void
.end method
