.class public final synthetic Ln7/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/h$a;


# static fields
.field public static final synthetic a:Ln7/l;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln7/l;

    invoke-direct {v0}, Ln7/l;-><init>()V

    sput-object v0, Ln7/l;->a:Ln7/l;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
