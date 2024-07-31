.class public final Lu4/l0$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ls3/m1;

.field public final b:Lw3/v$b;


# direct methods
.method public constructor <init>(Ls3/m1;Lw3/v$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/l0$c;->a:Ls3/m1;

    iput-object p2, p0, Lu4/l0$c;->b:Lw3/v$b;

    return-void
.end method

.method public synthetic constructor <init>(Ls3/m1;Lw3/v$b;Lu4/l0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu4/l0$c;-><init>(Ls3/m1;Lw3/v$b;)V

    return-void
.end method
