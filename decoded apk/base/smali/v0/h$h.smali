.class public final Lv0/h$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final a:Lv0/k;

.field public final b:[B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lv0/h$h;->b:[B

    invoke-static {p1}, Lv0/k;->g0([B)Lv0/k;

    move-result-object p1

    iput-object p1, p0, Lv0/h$h;->a:Lv0/k;

    return-void
.end method

.method public synthetic constructor <init>(ILv0/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lv0/h$h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()Lv0/h;
    .locals 2

    iget-object v0, p0, Lv0/h$h;->a:Lv0/k;

    invoke-virtual {v0}, Lv0/k;->c()V

    new-instance v0, Lv0/h$j;

    iget-object v1, p0, Lv0/h$h;->b:[B

    invoke-direct {v0, v1}, Lv0/h$j;-><init>([B)V

    return-object v0
.end method

.method public b()Lv0/k;
    .locals 1

    iget-object v0, p0, Lv0/h$h;->a:Lv0/k;

    return-object v0
.end method
