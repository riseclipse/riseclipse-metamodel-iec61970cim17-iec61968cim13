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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PFVArType1IEEEPFControllerItemProvider extends PFVArControllerType1DynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PFVArType1IEEEPFControllerItemProvider( AdapterFactory adapterFactory ) {
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

            addOvexPropertyDescriptor( object );
            addTpfcPropertyDescriptor( object );
            addVitminPropertyDescriptor( object );
            addVpfPropertyDescriptor( object );
            addVpfcbwPropertyDescriptor( object );
            addVpfrefPropertyDescriptor( object );
            addVvtmaxPropertyDescriptor( object );
            addVvtminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ovex feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOvexPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PFVArType1IEEEPFController_ovex_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_ovex_feature",
                                "_UI_PFVArType1IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Ovex(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpfc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpfcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PFVArType1IEEEPFController_tpfc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_tpfc_feature",
                                "_UI_PFVArType1IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Tpfc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vitmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVitminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PFVArType1IEEEPFController_vitmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_vitmin_feature",
                        "_UI_PFVArType1IEEEPFController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Vitmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vpf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVpfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PFVArType1IEEEPFController_vpf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_vpf_feature",
                                "_UI_PFVArType1IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Vpf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vpfcbw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVpfcbwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PFVArType1IEEEPFController_vpfcbw_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_vpfcbw_feature",
                        "_UI_PFVArType1IEEEPFController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Vpfcbw(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vpfref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVpfrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PFVArType1IEEEPFController_vpfref_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_vpfref_feature",
                        "_UI_PFVArType1IEEEPFController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Vpfref(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vvtmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvtmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PFVArType1IEEEPFController_vvtmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_vvtmax_feature",
                        "_UI_PFVArType1IEEEPFController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Vvtmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vvtmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvtminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PFVArType1IEEEPFController_vvtmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEPFController_vvtmin_feature",
                        "_UI_PFVArType1IEEEPFController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEPFController_Vvtmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PFVArType1IEEEPFController.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PFVArType1IEEEPFController" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PFVArType1IEEEPFController ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PFVArType1IEEEPFController_type" )
                : getString( "_UI_PFVArType1IEEEPFController_type" ) + " " + label;
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

        switch( notification.getFeatureID( PFVArType1IEEEPFController.class ) ) {
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
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
