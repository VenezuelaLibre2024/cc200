.class public final synthetic Ln5/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Ln5/r;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/r;

    invoke-direct {v0}, Ln5/r;-><init>()V

    sput-object v0, Ln5/r;->h:Ln5/r;

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

    check-cast p1, Ln5/m$i;

    check-cast p2, Ln5/m$i;

    invoke-static {p1, p2}, Ln5/m$i;->h(Ln5/m$i;Ln5/m$i;)I

    move-result p1

    return p1
.end method
