.class public final synthetic Ln8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# static fields
.field public static final synthetic a:Ln8/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a;

    invoke-direct {v0}, Ln8/a;-><init>()V

    sput-object v0, Ln8/a;->a:Ln8/a;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->a(Ly7/d;)Ld3/i;

    move-result-object p1

    return-object p1
.end method
