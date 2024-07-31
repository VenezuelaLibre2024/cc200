.class public abstract Lje/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public h:J

.field public i:Lje/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lje/l;->g:Lje/i;

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, v0}, Lje/h;-><init>(JLje/i;)V

    return-void
.end method

.method public constructor <init>(JLje/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lje/h;->h:J

    iput-object p3, p0, Lje/h;->i:Lje/i;

    return-void
.end method
