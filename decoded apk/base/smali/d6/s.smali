.class public final synthetic Ld6/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ld6/u;

.field public final synthetic i:Ld6/y;


# direct methods
.method public synthetic constructor <init>(Ld6/u;Ld6/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/s;->h:Ld6/u;

    iput-object p2, p0, Ld6/s;->i:Ld6/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld6/s;->h:Ld6/u;

    iget-object v1, p0, Ld6/s;->i:Ld6/y;

    iget v1, v1, Ld6/y;->a:I

    invoke-virtual {v0, v1}, Ld6/u;->e(I)V

    return-void
.end method
