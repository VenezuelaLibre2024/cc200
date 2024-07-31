.class public abstract Lce/s1;
.super Lce/k0;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/s1$a;
    }
.end annotation


# static fields
.field public static final j:Lce/s1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lce/s1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lce/s1$a;-><init>(Ltd/g;)V

    sput-object v0, Lce/s1;->j:Lce/s1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lce/k0;-><init>()V

    return-void
.end method
