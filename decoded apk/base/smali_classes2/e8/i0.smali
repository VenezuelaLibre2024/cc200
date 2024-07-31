.class public final synthetic Le8/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Le8/i0;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le8/i0;

    invoke-direct {v0}, Le8/i0;-><init>()V

    sput-object v0, Le8/i0;->h:Le8/i0;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lg8/f0$c;

    check-cast p2, Lg8/f0$c;

    invoke-static {p1, p2}, Le8/j0;->b(Lg8/f0$c;Lg8/f0$c;)I

    move-result p1

    return p1
.end method
