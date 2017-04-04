/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getH <em>H</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLfac <em>Lfac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLp <em>Lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLpp <em>Lpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getPfrac <em>Pfrac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getRa <em>Ra</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTbkr <em>Tbkr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTpo <em>Tpo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTppo <em>Tppo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTv <em>Tv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getVt <em>Vt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor()
 * @model
 * @generated
 */
public interface LoadMotor extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>D</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>D</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>D</em>' attribute.
     * @see #isSetD()
     * @see #unsetD()
     * @see #setD(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_D()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.d' kind='element'"
     * @generated
     */
    Float getD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getD <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>D</em>' attribute.
     * @see #isSetD()
     * @see #unsetD()
     * @see #getD()
     * @generated
     */
    void setD( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getD <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetD()
     * @see #getD()
     * @see #setD(Float)
     * @generated
     */
    void unsetD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getD <em>D</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>D</em>' attribute is set.
     * @see #unsetD()
     * @see #getD()
     * @see #setD(Float)
     * @generated
     */
    boolean isSetD();

    /**
     * Returns the value of the '<em><b>H</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #setH(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_H()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.h' kind='element'"
     * @generated
     */
    Float getH();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #getH()
     * @generated
     */
    void setH( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetH()
     * @see #getH()
     * @see #setH(Float)
     * @generated
     */
    void unsetH();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getH <em>H</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>H</em>' attribute is set.
     * @see #unsetH()
     * @see #getH()
     * @see #setH(Float)
     * @generated
     */
    boolean isSetH();

    /**
     * Returns the value of the '<em><b>Lfac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lfac</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lfac</em>' attribute.
     * @see #isSetLfac()
     * @see #unsetLfac()
     * @see #setLfac(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Lfac()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.lfac' kind='element'"
     * @generated
     */
    Float getLfac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLfac <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lfac</em>' attribute.
     * @see #isSetLfac()
     * @see #unsetLfac()
     * @see #getLfac()
     * @generated
     */
    void setLfac( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLfac <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLfac()
     * @see #getLfac()
     * @see #setLfac(Float)
     * @generated
     */
    void unsetLfac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLfac <em>Lfac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lfac</em>' attribute is set.
     * @see #unsetLfac()
     * @see #getLfac()
     * @see #setLfac(Float)
     * @generated
     */
    boolean isSetLfac();

    /**
     * Returns the value of the '<em><b>Lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lp</em>' attribute.
     * @see #isSetLp()
     * @see #unsetLp()
     * @see #setLp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Lp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.lp' kind='element'"
     * @generated
     */
    Float getLp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLp <em>Lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lp</em>' attribute.
     * @see #isSetLp()
     * @see #unsetLp()
     * @see #getLp()
     * @generated
     */
    void setLp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLp <em>Lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLp()
     * @see #getLp()
     * @see #setLp(Float)
     * @generated
     */
    void unsetLp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLp <em>Lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lp</em>' attribute is set.
     * @see #unsetLp()
     * @see #getLp()
     * @see #setLp(Float)
     * @generated
     */
    boolean isSetLp();

    /**
     * Returns the value of the '<em><b>Lpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lpp</em>' attribute.
     * @see #isSetLpp()
     * @see #unsetLpp()
     * @see #setLpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Lpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.lpp' kind='element'"
     * @generated
     */
    Float getLpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLpp <em>Lpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lpp</em>' attribute.
     * @see #isSetLpp()
     * @see #unsetLpp()
     * @see #getLpp()
     * @generated
     */
    void setLpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLpp <em>Lpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLpp()
     * @see #getLpp()
     * @see #setLpp(Float)
     * @generated
     */
    void unsetLpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLpp <em>Lpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lpp</em>' attribute is set.
     * @see #unsetLpp()
     * @see #getLpp()
     * @see #setLpp(Float)
     * @generated
     */
    boolean isSetLpp();

    /**
     * Returns the value of the '<em><b>Ls</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ls</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #setLs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Ls()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.ls' kind='element'"
     * @generated
     */
    Float getLs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #getLs()
     * @generated
     */
    void setLs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLs()
     * @see #getLs()
     * @see #setLs(Float)
     * @generated
     */
    void unsetLs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLs <em>Ls</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ls</em>' attribute is set.
     * @see #unsetLs()
     * @see #getLs()
     * @see #setLs(Float)
     * @generated
     */
    boolean isSetLs();

    /**
     * Returns the value of the '<em><b>Pfrac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pfrac</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #setPfrac(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Pfrac()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.pfrac' kind='element'"
     * @generated
     */
    Float getPfrac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #getPfrac()
     * @generated
     */
    void setPfrac( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Float)
     * @generated
     */
    void unsetPfrac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getPfrac <em>Pfrac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfrac</em>' attribute is set.
     * @see #unsetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Float)
     * @generated
     */
    boolean isSetPfrac();

    /**
     * Returns the value of the '<em><b>Ra</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ra</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ra</em>' attribute.
     * @see #isSetRa()
     * @see #unsetRa()
     * @see #setRa(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Ra()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.ra' kind='element'"
     * @generated
     */
    Float getRa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getRa <em>Ra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ra</em>' attribute.
     * @see #isSetRa()
     * @see #unsetRa()
     * @see #getRa()
     * @generated
     */
    void setRa( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getRa <em>Ra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRa()
     * @see #getRa()
     * @see #setRa(Float)
     * @generated
     */
    void unsetRa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getRa <em>Ra</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ra</em>' attribute is set.
     * @see #unsetRa()
     * @see #getRa()
     * @see #setRa(Float)
     * @generated
     */
    boolean isSetRa();

    /**
     * Returns the value of the '<em><b>Tbkr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tbkr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tbkr</em>' attribute.
     * @see #isSetTbkr()
     * @see #unsetTbkr()
     * @see #setTbkr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Tbkr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.tbkr' kind='element'"
     * @generated
     */
    Float getTbkr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTbkr <em>Tbkr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tbkr</em>' attribute.
     * @see #isSetTbkr()
     * @see #unsetTbkr()
     * @see #getTbkr()
     * @generated
     */
    void setTbkr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTbkr <em>Tbkr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTbkr()
     * @see #getTbkr()
     * @see #setTbkr(Float)
     * @generated
     */
    void unsetTbkr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTbkr <em>Tbkr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tbkr</em>' attribute is set.
     * @see #unsetTbkr()
     * @see #getTbkr()
     * @see #setTbkr(Float)
     * @generated
     */
    boolean isSetTbkr();

    /**
     * Returns the value of the '<em><b>Tpo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #setTpo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Tpo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.tpo' kind='element'"
     * @generated
     */
    Float getTpo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #getTpo()
     * @generated
     */
    void setTpo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpo()
     * @see #getTpo()
     * @see #setTpo(Float)
     * @generated
     */
    void unsetTpo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTpo <em>Tpo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpo</em>' attribute is set.
     * @see #unsetTpo()
     * @see #getTpo()
     * @see #setTpo(Float)
     * @generated
     */
    boolean isSetTpo();

    /**
     * Returns the value of the '<em><b>Tppo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tppo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #setTppo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Tppo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.tppo' kind='element'"
     * @generated
     */
    Float getTppo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #getTppo()
     * @generated
     */
    void setTppo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppo()
     * @see #getTppo()
     * @see #setTppo(Float)
     * @generated
     */
    void unsetTppo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTppo <em>Tppo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppo</em>' attribute is set.
     * @see #unsetTppo()
     * @see #getTppo()
     * @see #setTppo(Float)
     * @generated
     */
    boolean isSetTppo();

    /**
     * Returns the value of the '<em><b>Tv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #setTv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Tv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.tv' kind='element'"
     * @generated
     */
    Float getTv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #getTv()
     * @generated
     */
    void setTv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTv()
     * @see #getTv()
     * @see #setTv(Float)
     * @generated
     */
    void unsetTv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getTv <em>Tv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tv</em>' attribute is set.
     * @see #unsetTv()
     * @see #getTv()
     * @see #setTv(Float)
     * @generated
     */
    boolean isSetTv();

    /**
     * Returns the value of the '<em><b>Vt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vt</em>' attribute.
     * @see #isSetVt()
     * @see #unsetVt()
     * @see #setVt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_Vt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.vt' kind='element'"
     * @generated
     */
    Float getVt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getVt <em>Vt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vt</em>' attribute.
     * @see #isSetVt()
     * @see #unsetVt()
     * @see #getVt()
     * @generated
     */
    void setVt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getVt <em>Vt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVt()
     * @see #getVt()
     * @see #setVt(Float)
     * @generated
     */
    void unsetVt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getVt <em>Vt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vt</em>' attribute is set.
     * @see #unsetVt()
     * @see #getVt()
     * @see #setVt(Float)
     * @generated
     */
    boolean isSetVt();

    /**
     * Returns the value of the '<em><b>Load Aggregate</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadMotor <em>Load Motor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Aggregate</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadMotor_LoadAggregate()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadMotor
     * @model opposite="LoadMotor" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadMotor.LoadAggregate' kind='element'"
     * @generated
     */
    LoadAggregate getLoadAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @generated
     */
    void setLoadAggregate( LoadAggregate value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    void unsetLoadAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Aggregate</em>' reference is set.
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    boolean isSetLoadAggregate();

} // LoadMotor
