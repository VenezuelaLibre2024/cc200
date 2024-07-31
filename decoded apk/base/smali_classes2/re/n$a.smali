.class public Lre/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lre/v;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lre/v;",
            ")",
            "Ljava/util/List<",
            "Lre/m;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Lre/v;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lre/v;",
            "Ljava/util/List<",
            "Lre/m;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
