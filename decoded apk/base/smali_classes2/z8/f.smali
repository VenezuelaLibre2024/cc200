.class public final synthetic Lz8/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# instance fields
.field public final synthetic a:Ln7/g;


# direct methods
.method public synthetic constructor <init>(Ln7/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/f;->a:Ln7/g;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz8/f;->a:Ln7/g;

    invoke-static {v0}, Lz8/g;->b(Ln7/g;)Lb9/b;

    move-result-object v0

    return-object v0
.end method
