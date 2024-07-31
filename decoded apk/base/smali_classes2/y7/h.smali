.class public final synthetic Ly7/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/i;


# static fields
.field public static final synthetic b:Ly7/h;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ly7/h;

    invoke-direct {v0}, Ly7/h;-><init>()V

    sput-object v0, Ly7/h;->b:Ly7/h;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 0

    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
