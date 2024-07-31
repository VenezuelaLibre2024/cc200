.class public final Lvd/c$a;
.super Lvd/c;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvd/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lvd/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    invoke-static {}, Lvd/c;->a()Lvd/c;

    move-result-object v0

    invoke-virtual {v0}, Lvd/c;->b()I

    move-result v0

    return v0
.end method
