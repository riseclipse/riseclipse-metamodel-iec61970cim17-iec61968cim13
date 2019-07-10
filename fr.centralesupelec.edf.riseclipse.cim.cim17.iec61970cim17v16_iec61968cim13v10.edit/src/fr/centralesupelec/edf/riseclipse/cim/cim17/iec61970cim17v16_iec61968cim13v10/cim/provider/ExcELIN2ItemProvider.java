/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcELIN2ItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcELIN2ItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addEfdbasPropertyDescriptor( object );
            addIefmaxPropertyDescriptor( object );
            addIefmax2PropertyDescriptor( object );
            addIefminPropertyDescriptor( object );
            addK1PropertyDescriptor( object );
            addK1ecPropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addK3PropertyDescriptor( object );
            addK4PropertyDescriptor( object );
            addKd1PropertyDescriptor( object );
            addKe2PropertyDescriptor( object );
            addKetbPropertyDescriptor( object );
            addPid1maxPropertyDescriptor( object );
            addSeve1PropertyDescriptor( object );
            addSeve2PropertyDescriptor( object );
            addTb1PropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addTe2PropertyDescriptor( object );
            addTi1PropertyDescriptor( object );
            addTi3PropertyDescriptor( object );
            addTi4PropertyDescriptor( object );
            addTr4PropertyDescriptor( object );
            addUpmaxPropertyDescriptor( object );
            addUpminPropertyDescriptor( object );
            addVe1PropertyDescriptor( object );
            addVe2PropertyDescriptor( object );
            addXpPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Efdbas feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfdbasPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_efdbas_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_efdbas_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Efdbas(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Iefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_iefmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_iefmax_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Iefmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Iefmax2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIefmax2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_iefmax2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_iefmax2_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Iefmax2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Iefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_iefmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_iefmin_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Iefmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_k1_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_K1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K1ec feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK1ecPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_k1ec_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_k1ec_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_K1ec(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_k2_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_K2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_k3_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_K3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_k4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_k4_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_K4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kd1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKd1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_kd1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_kd1_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Kd1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ke2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKe2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ke2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ke2_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ke2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ketb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKetbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ketb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ketb_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ketb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pid1max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPid1maxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_pid1max_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_pid1max_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Pid1max(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seve1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeve1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_seve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_seve1_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Seve1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seve2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeve2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_seve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_seve2_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Seve2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_tb1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_tb1_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Tb1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Te feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_te_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Te(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Te2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTe2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_te2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_te2_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Te2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ti1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ti1_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ti1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ti3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ti3_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ti3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ti4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ti4_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ti4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tr4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTr4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_tr4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_tr4_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Tr4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Upmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_upmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_upmax_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Upmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Upmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_upmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_upmin_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Upmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ve1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVe1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ve1_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ve1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ve2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVe2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_ve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_ve2_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Ve2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcELIN2_xp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcELIN2_xp_feature",
                                "_UI_ExcELIN2_type" ),
                        CimPackage.eINSTANCE.getExcELIN2_Xp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcELIN2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcELIN2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcELIN2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcELIN2_type" )
                : getString( "_UI_ExcELIN2_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( ExcELIN2.class ) ) {
        case CimPackage.EXC_ELIN2__EFDBAS:
        case CimPackage.EXC_ELIN2__IEFMAX:
        case CimPackage.EXC_ELIN2__IEFMAX2:
        case CimPackage.EXC_ELIN2__IEFMIN:
        case CimPackage.EXC_ELIN2__K1:
        case CimPackage.EXC_ELIN2__K1EC:
        case CimPackage.EXC_ELIN2__K2:
        case CimPackage.EXC_ELIN2__K3:
        case CimPackage.EXC_ELIN2__K4:
        case CimPackage.EXC_ELIN2__KD1:
        case CimPackage.EXC_ELIN2__KE2:
        case CimPackage.EXC_ELIN2__KETB:
        case CimPackage.EXC_ELIN2__PID1MAX:
        case CimPackage.EXC_ELIN2__SEVE1:
        case CimPackage.EXC_ELIN2__SEVE2:
        case CimPackage.EXC_ELIN2__TB1:
        case CimPackage.EXC_ELIN2__TE:
        case CimPackage.EXC_ELIN2__TE2:
        case CimPackage.EXC_ELIN2__TI1:
        case CimPackage.EXC_ELIN2__TI3:
        case CimPackage.EXC_ELIN2__TI4:
        case CimPackage.EXC_ELIN2__TR4:
        case CimPackage.EXC_ELIN2__UPMAX:
        case CimPackage.EXC_ELIN2__UPMIN:
        case CimPackage.EXC_ELIN2__VE1:
        case CimPackage.EXC_ELIN2__VE2:
        case CimPackage.EXC_ELIN2__XP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
