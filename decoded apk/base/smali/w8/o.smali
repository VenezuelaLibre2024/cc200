.class public final synthetic Lw8/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# static fields
.field public static final a:Ly7/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw8/o;

    invoke-direct {v0}, Lw8/o;-><init>()V

    sput-object v0, Lw8/o;->a:Ly7/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly7/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/iid/Registrar;->lambda$getComponents$0$Registrar(Ly7/d;)Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object p1

    return-object p1
.end method
