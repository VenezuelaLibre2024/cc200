.class public final synthetic Ln5/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Ln5/h;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/h;

    invoke-direct {v0}, Ln5/h;-><init>()V

    sput-object v0, Ln5/h;->h:Ln5/h;

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

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-static {p1, p2}, Ln5/m$g;->f(Ljava/util/List;Ljava/util/List;)I

    move-result p1

    return p1
.end method