.class public Lbc/c$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lcc/e;

.field public b:J

.field public c:I

.field public d:F

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc/c$a;)V
    .locals 0

    invoke-direct {p0}, Lbc/c$c;-><init>()V

    return-void
.end method

.method public static synthetic a(Lbc/c$c;)Lcc/e;
    .locals 0

    iget-object p0, p0, Lbc/c$c;->a:Lcc/e;

    return-object p0
.end method

.method public static synthetic b(Lbc/c$c;Lcc/e;)Lcc/e;
    .locals 0

    iput-object p1, p0, Lbc/c$c;->a:Lcc/e;

    return-object p1
.end method

.method public static synthetic c(Lbc/c$c;)I
    .locals 0

    iget p0, p0, Lbc/c$c;->c:I

    return p0
.end method

.method public static synthetic d(Lbc/c$c;I)I
    .locals 0

    iput p1, p0, Lbc/c$c;->c:I

    return p1
.end method

.method public static synthetic e(Lbc/c$c;)J
    .locals 2

    iget-wide v0, p0, Lbc/c$c;->b:J

    return-wide v0
.end method

.method public static synthetic f(Lbc/c$c;J)J
    .locals 0

    iput-wide p1, p0, Lbc/c$c;->b:J

    return-wide p1
.end method

.method public static synthetic g(Lbc/c$c;)F
    .locals 0

    iget p0, p0, Lbc/c$c;->d:F

    return p0
.end method

.method public static synthetic h(Lbc/c$c;F)F
    .locals 0

    iput p1, p0, Lbc/c$c;->d:F

    return p1
.end method

.method public static synthetic i(Lbc/c$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lbc/c$c;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic j(Lbc/c$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lbc/c$c;->e:Ljava/lang/String;

    return-object p1
.end method
