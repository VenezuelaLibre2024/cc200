.class public Lbc/a$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc/a$a;)V
    .locals 0

    invoke-direct {p0}, Lbc/a$c;-><init>()V

    return-void
.end method

.method public static synthetic a(Lbc/a$c;)I
    .locals 0

    iget p0, p0, Lbc/a$c;->a:I

    return p0
.end method

.method public static synthetic b(Lbc/a$c;I)I
    .locals 0

    iput p1, p0, Lbc/a$c;->a:I

    return p1
.end method

.method public static synthetic c(Lbc/a$c;)I
    .locals 0

    iget p0, p0, Lbc/a$c;->b:I

    return p0
.end method

.method public static synthetic d(Lbc/a$c;I)I
    .locals 0

    iput p1, p0, Lbc/a$c;->b:I

    return p1
.end method

.method public static synthetic e(Lbc/a$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lbc/a$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic f(Lbc/a$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lbc/a$c;->d:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic g(Lbc/a$c;)J
    .locals 2

    iget-wide v0, p0, Lbc/a$c;->c:J

    return-wide v0
.end method

.method public static synthetic h(Lbc/a$c;J)J
    .locals 0

    iput-wide p1, p0, Lbc/a$c;->c:J

    return-wide p1
.end method
