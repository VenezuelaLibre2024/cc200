.class public final Lj3/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/c$b;,
        Lj3/c$a;
    }
.end annotation


# static fields
.field public static final c:Lj3/c;


# instance fields
.field public final a:J

.field public final b:Lj3/c$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/c$a;

    invoke-direct {v0}, Lj3/c$a;-><init>()V

    invoke-virtual {v0}, Lj3/c$a;->a()Lj3/c;

    move-result-object v0

    sput-object v0, Lj3/c;->c:Lj3/c;

    return-void
.end method

.method public constructor <init>(JLj3/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj3/c;->a:J

    iput-object p3, p0, Lj3/c;->b:Lj3/c$b;

    return-void
.end method

.method public static c()Lj3/c$a;
    .locals 1

    new-instance v0, Lj3/c$a;

    invoke-direct {v0}, Lj3/c$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lj3/c;->a:J

    return-wide v0
.end method

.method public b()Lj3/c$b;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lj3/c;->b:Lj3/c$b;

    return-object v0
.end method
