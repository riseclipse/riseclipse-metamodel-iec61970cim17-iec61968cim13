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
 * A representation of the model object '<em><b>Gov Hydro1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getAt <em>At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getHdam <em>Hdam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getQnl <em>Qnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRperm <em>Rperm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRtemp <em>Rtemp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getVelm <em>Velm</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1()
 * @model
 * @generated
 */
public interface GovHydro1 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>At</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>At</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>At</em>' attribute.
     * @see #isSetAt()
     * @see #unsetAt()
     * @see #setAt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_At()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.at' kind='element'"
     * @generated
     */
    Float getAt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getAt <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>At</em>' attribute.
     * @see #isSetAt()
     * @see #unsetAt()
     * @see #getAt()
     * @generated
     */
    void setAt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getAt <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAt()
     * @see #getAt()
     * @see #setAt(Float)
     * @generated
     */
    void unsetAt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getAt <em>At</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>At</em>' attribute is set.
     * @see #unsetAt()
     * @see #getAt()
     * @see #setAt(Float)
     * @generated
     */
    boolean isSetAt();

    /**
     * Returns the value of the '<em><b>Dturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dturb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #setDturb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Dturb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.dturb' kind='element'"
     * @generated
     */
    Float getDturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #getDturb()
     * @generated
     */
    void setDturb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDturb()
     * @see #getDturb()
     * @see #setDturb(Float)
     * @generated
     */
    void unsetDturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getDturb <em>Dturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dturb</em>' attribute is set.
     * @see #unsetDturb()
     * @see #getDturb()
     * @see #setDturb(Float)
     * @generated
     */
    boolean isSetDturb();

    /**
     * Returns the value of the '<em><b>Gmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #setGmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Gmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.gmax' kind='element'"
     * @generated
     */
    Float getGmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #getGmax()
     * @generated
     */
    void setGmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmax()
     * @see #getGmax()
     * @see #setGmax(Float)
     * @generated
     */
    void unsetGmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmax <em>Gmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmax</em>' attribute is set.
     * @see #unsetGmax()
     * @see #getGmax()
     * @see #setGmax(Float)
     * @generated
     */
    boolean isSetGmax();

    /**
     * Returns the value of the '<em><b>Gmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #setGmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Gmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.gmin' kind='element'"
     * @generated
     */
    Float getGmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #getGmin()
     * @generated
     */
    void setGmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmin()
     * @see #getGmin()
     * @see #setGmin(Float)
     * @generated
     */
    void unsetGmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getGmin <em>Gmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmin</em>' attribute is set.
     * @see #unsetGmin()
     * @see #getGmin()
     * @see #setGmin(Float)
     * @generated
     */
    boolean isSetGmin();

    /**
     * Returns the value of the '<em><b>Hdam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hdam</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hdam</em>' attribute.
     * @see #isSetHdam()
     * @see #unsetHdam()
     * @see #setHdam(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Hdam()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.hdam' kind='element'"
     * @generated
     */
    Float getHdam();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getHdam <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hdam</em>' attribute.
     * @see #isSetHdam()
     * @see #unsetHdam()
     * @see #getHdam()
     * @generated
     */
    void setHdam( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getHdam <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHdam()
     * @see #getHdam()
     * @see #setHdam(Float)
     * @generated
     */
    void unsetHdam();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getHdam <em>Hdam</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hdam</em>' attribute is set.
     * @see #unsetHdam()
     * @see #getHdam()
     * @see #setHdam(Float)
     * @generated
     */
    boolean isSetHdam();

    /**
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mwbase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Mwbase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.mwbase' kind='element'"
     * @generated
     */
    Float getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @generated
     */
    void setMwbase( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    boolean isSetMwbase();

    /**
     * Returns the value of the '<em><b>Qnl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qnl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qnl</em>' attribute.
     * @see #isSetQnl()
     * @see #unsetQnl()
     * @see #setQnl(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Qnl()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.qnl' kind='element'"
     * @generated
     */
    Float getQnl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getQnl <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qnl</em>' attribute.
     * @see #isSetQnl()
     * @see #unsetQnl()
     * @see #getQnl()
     * @generated
     */
    void setQnl( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getQnl <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQnl()
     * @see #getQnl()
     * @see #setQnl(Float)
     * @generated
     */
    void unsetQnl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getQnl <em>Qnl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qnl</em>' attribute is set.
     * @see #unsetQnl()
     * @see #getQnl()
     * @see #setQnl(Float)
     * @generated
     */
    boolean isSetQnl();

    /**
     * Returns the value of the '<em><b>Rperm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rperm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rperm</em>' attribute.
     * @see #isSetRperm()
     * @see #unsetRperm()
     * @see #setRperm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Rperm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.rperm' kind='element'"
     * @generated
     */
    Float getRperm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRperm <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rperm</em>' attribute.
     * @see #isSetRperm()
     * @see #unsetRperm()
     * @see #getRperm()
     * @generated
     */
    void setRperm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRperm <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRperm()
     * @see #getRperm()
     * @see #setRperm(Float)
     * @generated
     */
    void unsetRperm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRperm <em>Rperm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rperm</em>' attribute is set.
     * @see #unsetRperm()
     * @see #getRperm()
     * @see #setRperm(Float)
     * @generated
     */
    boolean isSetRperm();

    /**
     * Returns the value of the '<em><b>Rtemp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rtemp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rtemp</em>' attribute.
     * @see #isSetRtemp()
     * @see #unsetRtemp()
     * @see #setRtemp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Rtemp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.rtemp' kind='element'"
     * @generated
     */
    Float getRtemp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRtemp <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rtemp</em>' attribute.
     * @see #isSetRtemp()
     * @see #unsetRtemp()
     * @see #getRtemp()
     * @generated
     */
    void setRtemp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRtemp <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRtemp()
     * @see #getRtemp()
     * @see #setRtemp(Float)
     * @generated
     */
    void unsetRtemp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getRtemp <em>Rtemp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rtemp</em>' attribute is set.
     * @see #unsetRtemp()
     * @see #getRtemp()
     * @see #setRtemp(Float)
     * @generated
     */
    boolean isSetRtemp();

    /**
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Tf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.tf' kind='element'"
     * @generated
     */
    Float getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #getTf()
     * @generated
     */
    void setTf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Float)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTf <em>Tf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf</em>' attribute is set.
     * @see #unsetTf()
     * @see #getTf()
     * @see #setTf(Float)
     * @generated
     */
    boolean isSetTf();

    /**
     * Returns the value of the '<em><b>Tg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tg</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #setTg(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Tg()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.tg' kind='element'"
     * @generated
     */
    Float getTg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #getTg()
     * @generated
     */
    void setTg( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTg()
     * @see #getTg()
     * @see #setTg(Float)
     * @generated
     */
    void unsetTg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTg <em>Tg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tg</em>' attribute is set.
     * @see #unsetTg()
     * @see #getTg()
     * @see #setTg(Float)
     * @generated
     */
    boolean isSetTg();

    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Tr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.tr' kind='element'"
     * @generated
     */
    Float getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Float)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Float)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Tw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tw</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #setTw(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Tw()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.tw' kind='element'"
     * @generated
     */
    Float getTw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #getTw()
     * @generated
     */
    void setTw( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw()
     * @see #getTw()
     * @see #setTw(Float)
     * @generated
     */
    void unsetTw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getTw <em>Tw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw</em>' attribute is set.
     * @see #unsetTw()
     * @see #getTw()
     * @see #setTw(Float)
     * @generated
     */
    boolean isSetTw();

    /**
     * Returns the value of the '<em><b>Velm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Velm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Velm</em>' attribute.
     * @see #isSetVelm()
     * @see #unsetVelm()
     * @see #setVelm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydro1_Velm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydro1.velm' kind='element'"
     * @generated
     */
    Float getVelm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getVelm <em>Velm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Velm</em>' attribute.
     * @see #isSetVelm()
     * @see #unsetVelm()
     * @see #getVelm()
     * @generated
     */
    void setVelm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getVelm <em>Velm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVelm()
     * @see #getVelm()
     * @see #setVelm(Float)
     * @generated
     */
    void unsetVelm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1#getVelm <em>Velm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Velm</em>' attribute is set.
     * @see #unsetVelm()
     * @see #getVelm()
     * @see #setVelm(Float)
     * @generated
     */
    boolean isSetVelm();

} // GovHydro1
