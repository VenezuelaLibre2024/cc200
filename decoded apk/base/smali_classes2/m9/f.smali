.class public final synthetic Lm9/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld3/g;


# instance fields
.field public final synthetic a:Lm9/g;


# direct methods
.method public synthetic constructor <init>(Lm9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/f;->a:Lm9/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm9/f;->a:Lm9/g;

    check-cast p1, Lm9/z;

    invoke-static {v0, p1}, Lm9/g;->b(Lm9/g;Lm9/z;)[B

    move-result-object p1

    return-object p1
.end method
