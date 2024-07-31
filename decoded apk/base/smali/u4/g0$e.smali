.class public final Lu4/g0$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lu4/u0;

.field public final b:[Z

.field public final c:[Z

.field public final d:[Z


# direct methods
.method public constructor <init>(Lu4/u0;[Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/g0$e;->a:Lu4/u0;

    iput-object p2, p0, Lu4/g0$e;->b:[Z

    iget p1, p1, Lu4/u0;->h:I

    new-array p2, p1, [Z

    iput-object p2, p0, Lu4/g0$e;->c:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Lu4/g0$e;->d:[Z

    return-void
.end method
