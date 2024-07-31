.class public Lz7/p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz7/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/p;-><init>(Lz7/p$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz7/p$b<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lz7/p;


# direct methods
.method public constructor <init>(Lz7/p;)V
    .locals 0

    iput-object p1, p0, Lz7/p$a;->a:Lz7/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lz7/p$a;->a:Lz7/p;

    invoke-static {v0, p1}, Lz7/p;->A(Lz7/p;Ljava/lang/Throwable;)Z

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget-object v0, p0, Lz7/p$a;->a:Lz7/p;

    invoke-static {v0, p1}, Lz7/p;->z(Lz7/p;Ljava/lang/Object;)Z

    return-void
.end method
