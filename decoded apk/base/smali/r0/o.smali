.class public final Lr0/o;
.super Lr0/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr0/n<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lr0/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/o;

    invoke-direct {v0}, Lr0/o;-><init>()V

    sput-object v0, Lr0/o;->a:Lr0/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lr0/n;-><init>(Ltd/g;)V

    return-void
.end method
