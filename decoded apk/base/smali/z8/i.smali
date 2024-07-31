.class public Lz8/i;
.super Ln7/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz8/i$a;
    }
.end annotation


# instance fields
.field public final h:Lz8/i$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz8/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln7/m;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lz8/i;->h:Lz8/i$a;

    return-void
.end method

.method public constructor <init>(Lz8/i$a;)V
    .locals 0

    invoke-direct {p0}, Ln7/m;-><init>()V

    iput-object p1, p0, Lz8/i;->h:Lz8/i$a;

    return-void
.end method
