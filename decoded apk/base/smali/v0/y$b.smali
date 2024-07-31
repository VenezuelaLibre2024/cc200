.class public Lv0/y$b;
.super Lv0/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lv0/y<",
        "TT;*>;>",
        "Lv0/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lv0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv0/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lv0/b;-><init>()V

    iput-object p1, p0, Lv0/y$b;->b:Lv0/y;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lv0/i;Lv0/p;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/y$b;->g(Lv0/i;Lv0/p;)Lv0/y;

    move-result-object p1

    return-object p1
.end method

.method public g(Lv0/i;Lv0/p;)Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/i;",
            "Lv0/p;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lv0/y$b;->b:Lv0/y;

    invoke-static {v0, p1, p2}, Lv0/y;->I(Lv0/y;Lv0/i;Lv0/p;)Lv0/y;

    move-result-object p1

    return-object p1
.end method
