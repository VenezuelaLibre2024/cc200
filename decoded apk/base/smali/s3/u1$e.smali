.class public final Ls3/u1$e;
.super Ls3/u1$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final t:Ls3/u1$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/u1$d$a;

    invoke-direct {v0}, Ls3/u1$d$a;-><init>()V

    invoke-virtual {v0}, Ls3/u1$d$a;->g()Ls3/u1$e;

    move-result-object v0

    sput-object v0, Ls3/u1$e;->t:Ls3/u1$e;

    return-void
.end method

.method public constructor <init>(Ls3/u1$d$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ls3/u1$d;-><init>(Ls3/u1$d$a;Ls3/u1$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$d$a;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$e;-><init>(Ls3/u1$d$a;)V

    return-void
.end method
